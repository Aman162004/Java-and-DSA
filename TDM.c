#include <stdio.h>
#include <stdlib.h>

// Define the structure for the term-document matrix
typedef struct {
    int **matrix; // 2D array to store term frequencies
    int numTerms; // Number of terms
    int numDocuments; // Number of documents
} TermDocumentMatrix;

// Function to create a term-document matrix
TermDocumentMatrix* createTermDocumentMatrix(int numTerms, int numDocuments) {
    TermDocumentMatrix* tdm = (TermDocumentMatrix*)malloc(sizeof(TermDocumentMatrix)); // Allocate memory for the term-document matrix
    tdm->numTerms = numTerms;
    tdm->numDocuments = numDocuments;
    tdm->matrix = (int**)malloc(numTerms * sizeof(int*)); // Allocate memory for the rows
    for (int i = 0; i < numTerms; i++) {
        tdm->matrix[i] = (int*)malloc(numDocuments * sizeof(int)); // Allocate memory for the columns
        for (int j = 0; j < numDocuments; j++) {
            tdm->matrix[i][j] = 0; // Initialize all elements to 0
        }
    }
    return tdm;
}

// Function to update the term frequency in the term-document matrix
void updateTermFrequency(TermDocumentMatrix* tdm, int termIndex, int docIndex, int frequency) {
    if (termIndex >= 0 && termIndex < tdm->numTerms && docIndex >= 0 && docIndex < tdm->numDocuments) {
        tdm->matrix[termIndex][docIndex] = frequency; // Update the frequency
    }
}

// Function to get the term frequency from the term-document matrix
int getTermFrequency(TermDocumentMatrix* tdm, int termIndex, int docIndex) {
    // Check if the termIndex and docIndex are within valid bounds
    if (termIndex >= 0 && termIndex < tdm->numTerms && docIndex >= 0 && docIndex < tdm->numDocuments) {
        return tdm->matrix[termIndex][docIndex]; // Return the frequency
    } else {
        return -1; // Return -1 if indices are out of bounds
    }
}

// Function to get the document frequency of a term (number of documents containing the term)
int getDocumentFrequency(TermDocumentMatrix* tdm, int termIndex) {
    if (termIndex < 0 || termIndex >= tdm->numTerms) return -1;
    int count = 0;
    for (int i = 0; i < tdm->numDocuments; i++) {
        if (tdm->matrix[termIndex][i] > 0) count++; // Count the number of documents containing the term
    }
    return count;
}

// Function to get the total number of terms in a document
int getTotalTermsInDocument(TermDocumentMatrix* tdm, int docIndex) {
    if (docIndex < 0 || docIndex >= tdm->numDocuments) return -1;
    int total = 0;
    for (int i = 0; i < tdm->numTerms; i++) {
        total += tdm->matrix[i][docIndex]; // Sum the frequencies of all terms in the document
    }
    return total;
}

// Define the structure for a sparse matrix element
typedef struct {
    int row, col, value;
} SparseElement;

// Define the structure for a sparse matrix
typedef struct {
    SparseElement* elements; // Array of non-zero elements
    int numElements; // Number of non-zero elements
    int numRows; // Number of rows
    int numCols; // Number of columns
} SparseMatrix;

// Function to convert a term-document matrix to a sparse matrix
SparseMatrix* toSparseMatrix(TermDocumentMatrix* tdm) {
    SparseMatrix* sparse = (SparseMatrix*)malloc(sizeof(SparseMatrix)); // Allocate memory for the sparse matrix
    sparse->numRows = tdm->numTerms;
    sparse->numCols = tdm->numDocuments;
    
    int count = 0;
    for (int i = 0; i < tdm->numTerms; i++) {
        for (int j = 0; j < tdm->numDocuments; j++) {
            if (tdm->matrix[i][j] != 0) count++; // Count the number of non-zero elements
        }
    }
    
    sparse->numElements = count;
    sparse->elements = (SparseElement*)malloc(count * sizeof(SparseElement)); // Allocate memory for the non-zero elements
    
    int index = 0;
    for (int i = 0; i < tdm->numTerms; i++) {
        for (int j = 0; j < tdm->numDocuments; j++) {
            if (tdm->matrix[i][j] != 0) {
                sparse->elements[index++] = (SparseElement){i, j, tdm->matrix[i][j]}; // Store the non-zero elements
            }
        }
    }
    return sparse;
}

// Function to free the memory allocated for the term-document matrix
void freeTermDocumentMatrix(TermDocumentMatrix* tdm) {
    for (int i = 0; i < tdm->numTerms; i++) {
        free(tdm->matrix[i]); // Free the memory for each row
    }
    free(tdm->matrix); // Free the memory for the rows array
    free(tdm); // Free the memory for the term-document matrix structure
}

// Function to free the memory allocated for the sparse matrix
void freeSparseMatrix(SparseMatrix* sparse) {
    free(sparse->elements); // Free the memory for the elements array
    free(sparse); // Free the memory for the sparse matrix structure
}