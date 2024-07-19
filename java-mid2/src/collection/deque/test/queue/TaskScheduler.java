package collection.deque.test.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class TaskScheduler {

    private Deque<Task> taks = new ArrayDeque<>();

    public void addTask(Task task){
        taks.offer(task);
    }

    public int getRemainingTasks() {
        return taks.size();
    }

    public void processNextTask(){
        Task task = taks.poll();
        if(task != null){
            task.execute();
        }
    }
}
