package Sparsh;

import java.util.Arrays;
import java.util.Comparator;

class Products {
    String name;
    String seller;
    double price;
    double rating;
    String category; // Added category field

    public Products(double price, double rating, String seller, String name, String category) {
        this.price = price;
        this.seller = seller;
        this.name = name;
        this.rating = rating;
        this.category = category; // Initialize category
    }
}

class indirect_array {
    int[] indices;
    int size;

    public indirect_array(int size) {
        this.size = size;
        this.indices = new int[size];
        for (int i = 0; i < size; i++) {
            indices[i] = i;
        }
    }

    public void Sort_product_ByCategory(Products[] products) {
        Arrays.sort(indices, Comparator.comparingInt(i -> products[i].category.hashCode())); // Corrected hashcode() to hashCode()
    }

    public void Sort_product_ByPrice(Products[] products) {
        Arrays.sort(indices, Comparator.comparingDouble(i -> products[i].price)); // Completed comparator
    }
}

public class Webpage {
    public static void main(String[] args) {
        // Example usage
        Products[] products = {
            new Products(10.0, 4.5, "Seller1", "Product1", "Category1"),
            new Products(20.0, 4.0, "Seller2", "Product2", "Category2"),
            new Products(15.0, 3.5, "Seller3", "Product3", "Category1")
        };

        indirect_array ia = new indirect_array(products.length);
        ia.Sort_product_ByCategory(products);
        System.out.println("Sorted by category:");
        for (int index : ia.indices) {
            System.out.println(products[index].name);
        }

        ia.Sort_product_ByPrice(products);
        System.out.println("Sorted by price:");
        for (int index : ia.indices) {
            System.out.println(products[index].name);
        }
    }
}