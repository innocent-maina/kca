#include <stdio.h>
#include <stdlib.h>
#include <time.h>

// create numeric ID and points (max 100) as 2 separate members.

// Define the maximum number of points a student can get
#define MAX_POINTS 100

// Define the structure for a student
struct student {
    int id;
    int points;
};

int main() {
    int num_students;
    struct student *students;
    int max_points_index = 0;

    // Seed the random number generator with the current time
    srand(time(NULL));

    // Ask the user for the number of students
    printf("Enter the number of students: ");
    scanf("%d", &num_students);

    // Allocate memory for the students array
    students = malloc(num_students * sizeof(struct student));

    // Generate random data for each student and find the student with the highest points
    for (int i = 0; i < num_students; i++) {
        // Generate a unique ID for each student
        int id = i + 1;

        // Generate a random number of points between 0 and MAX_POINTS
        int points = rand() % (MAX_POINTS + 1);

        // Store the ID and points in the current student struct
        students[i].id = id;
        students[i].points = points;

        // Check if the current student has more points than the previous highest
        if (points > students[max_points_index].points) {
            max_points_index = i;
        }
    }

    // Print the ID and points of the student with the highest score
    printf("The student with the highest points is:\n");
    printf("ID: %d\n", students[max_points_index].id);
    printf("Points: %d\n", students[max_points_index].points);

    // Free the memory used by the students array
    free(students);

    return 0;
}
