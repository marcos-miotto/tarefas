package com.example.tarefas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/tasks")
public class TaskController {
    // Lista para armazenar as tarefas
    private List<Task> tasks = new ArrayList<>();
    // Método para lidar com requisições GET em "/tasks".
    @GetMapping
    public String getTasks(Model model) {
        model.addAttribute("tasks", tasks);
        return "index";
    }
    // Método para lidar com requisições POST em "/tasks".
    @PostMapping
    @ResponseBody
    public Task addTask(@RequestBody Task task) {
        tasks.add(task);
        return task;
    }

    // Método para lidar com requisições DELETE em "/tasks/{taskId}".
    @DeleteMapping("/{taskId}")
    @ResponseBody
    public ResponseEntity<String> deleteTask(@PathVariable String taskId) {
        Task taskToRemove = null;
        // Procura a tarefa na lista pelo ID
        for (Task task : tasks) {
            if (task.getId().equals(taskId)) {
                taskToRemove = task;
                break;
            }
        }
        // Remove a tarefa se encontrada, senão retorna "Not Found"
        if (taskToRemove != null) {
            tasks.remove(taskToRemove);
            return ResponseEntity.ok("Tarefa excluída com sucesso");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
