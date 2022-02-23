package com.timbuchalka.todolist;

import datamodel.TodoData;
import datamodel.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {

    private List<TodoItem> todoItems;

    @FXML
    private ListView<TodoItem> todoListView;

    @FXML
    private TextArea itemDetailsTextArea;
    @FXML
    private Label deadlineLabel;

    public void initialize() {
  /*      TodoItem item1 = new TodoItem("Mail birthday card", "Buy a 30th birthday car for john", LocalDate.of(2016, Month.APRIL, 25));
        TodoItem item2 = new TodoItem("Doctor's appointment ", "See Dr.Smith at 123 Main Street. Bring paper ", LocalDate.of(2016, Month.MAY, 23));
        TodoItem item3 = new TodoItem("Buy the food", "Milk and water", LocalDate.of(2016, Month.AUGUST, 25));
        TodoItem item4 = new TodoItem("Pickup Dougs at the train station", "Doug arriving at 17:00", LocalDate.of(2016, Month.JULY, 20));
        TodoItem item5 = new TodoItem("Mail birthday card", "Buy a 30th birthday car for john", LocalDate.of(2016, Month.APRIL, 25));
        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);
        todoItems.add(item5);

        TodoData.getInstance().setTodoItems(todoItems);*/

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem newValue) {
                if (newValue != null){
                    TodoItem item =  todoListView.getSelectionModel().getSelectedItem();
                    itemDetailsTextArea.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d yyyy");
                    deadlineLabel.setText(df.format(item.getDeadline()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst(); // select first name
    }
    @FXML
    public void handleClickListView(){
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        itemDetailsTextArea.setText(item.getDetails());

        //System.out.println("The selected item is " + item);
        //StringBuilder sb = new StringBuilder(item.getDetails());
        //sb.append("\n\n\n\n\n");
        //sb.append("Due ");
        //sb.append(item.getDeadline().toString());
        //itemDetailsTextArea.setText(sb.toString());



    }
}
