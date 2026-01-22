#include <stdio.h>
#include <string.h>

struct Book {
    char title[50];
    char author[50];
    int price;
};

int main() {
    struct Book books[5] = {
        {"BookA", "AuthorA", 300},
        {"BookB", "AuthorB", 150},
        {"BookC", "AuthorC", 250},
        {"BookD", "AuthorD", 100},
        {"BookE", "AuthorE", 200}
    };

    // Bubble sort by price
    struct Book temp;
    for (int i = 0; i < 5 - 1; i++) {
        for (int j = 0; j < 5 - i - 1; j++) {
            if (books[j].price > books[j + 1].price) {
                temp = books[j];
                books[j] = books[j + 1];
                books[j + 1] = temp;
            }
        }
    }

    // Print sorted books
    printf("Books sorted by price:\n");
    for (int i = 0; i < 5; i++) {
        printf("%s by %s - Rs.%d\n", books[i].title, books[i].author, books[i].price);
    }

    return 0;
}
