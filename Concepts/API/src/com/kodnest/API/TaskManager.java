package com.kodnest.API;

import java.util.ArrayList;
import java.util.Scanner;

public class TaskManager {
	 private static ArrayList<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        

        while(true) {
            System.out.println("--------- Task Manager ---------");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. List Tasks");
            System.out.println("4. Exit");
            System.out.print("Enter option: ");
            String option = scanner.nextLine();

            switch (option) {
                case "1":
                    addTask(scanner);
                    break;
                case "2":
                    removeTask(scanner);
                    break;
                case "3":
                    listTasks();
                    break;
                case "4":
                    System.out.println("Exiting the Task Manager...");
                    break;
                default:
                    System.out.println("Invalid option, please try again.");
                    break;
            }
            
            System.out.println();
            break;
        }
    }

    private static void addTask(Scanner scanner) {
        System.out.print("Enter the task name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the task description: ");
        String description = scanner.nextLine();

        System.out.print("Enter the task due date: ");
        String dueDate = scanner.nextLine();

        Task task = new Task(name, description, dueDate);
        tasks.add(task);

        System.out.println("Task added successfully!");
    }

    private static void removeTask(Scanner scanner) {
        System.out.print("Enter the task number to remove: ");
        int taskNumber = Integer.parseInt(scanner.nextLine()) - 1;

        if (taskNumber < 0 || taskNumber >= tasks.size()) {
            System.out.println("Invalid task number.");
            return;
        }

        tasks.remove(taskNumber);

        System.out.println("Task removed successfully!");
    }

    private static void listTasks() {
        if (tasks.isEmpty()) {
            System.out.println("No tasks available.");
        } 
        else {
            System.out.println("------ Task List ------");
            for (int i = 0; i < tasks.size(); i++) {
                Task task = tasks.get(i);
                System.out.println("Task " + (i + 1));
                System.out.println("Name: " + task.getName());
                System.out.println("Description: " + task.getDescription());
                System.out.println("Due Date: " + task.getDueDate());
                System.out.println();
          }
        }
    }
}



