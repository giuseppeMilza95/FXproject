package sample;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.BufferedReader;
import java.io.BufferedWriter;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.Iterator;
import java.util.List;



public class TodoData {


    private final String filename = "TodoListItems.txt";
    private ObservableList<TodoItem> todoItems;
    private static TodoData instance = new TodoData();

    private DateTimeFormatter formatter;

    public static TodoData getInstance() {
        return instance;
    }

    private TodoData() {
        formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    }

    public ObservableList<TodoItem> getTodoItems() {
        return todoItems;
    }


    public void loadTodoData() throws IOException {
        todoItems = FXCollections.observableArrayList();
        Path path = Paths.get(filename);
        BufferedReader reader = Files.newBufferedReader(path);
        String input;
        try {
            while ((input = reader.readLine()) != null) {
                String[] itemPieces = input.split("\t");
                String shortDescription = itemPieces[0];
                String detail = itemPieces[1];
                String dateString = itemPieces[2];
                LocalDate date = LocalDate.parse(dateString, formatter);
                TodoItem item = new TodoItem(shortDescription, detail, date);
                todoItems.add(item);

            }

        } finally {
            if (reader != null){
                reader.close();
            }
        }

    }


    public void writeTodoData() throws IOException {
        Path path = Paths.get(filename);
        BufferedWriter bw = Files.newBufferedWriter(path);
        try {
            Iterator<TodoItem> iter = todoItems.iterator();
            while(iter.hasNext()) {
                TodoItem item = iter.next();
                bw.write(String.format("%s\t%s\t%s",
                        item.getShortDescription(),
                        item.getDetails(),
                        item.getDeadline().format(formatter)));
                bw.newLine();
            }

        } finally {
            if(bw != null) {
                bw.close();
            }
        }


        }



        public void addTodoItem(TodoItem item){
        todoItems.add(item);
        }






    }
