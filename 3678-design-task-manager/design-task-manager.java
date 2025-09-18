class TaskManager {
    private class Task implements Comparable<Task>{
        int userId;
        int taskId;
        int priority;

        public Task(int userId, int taskId, int priority) {
            this.userId = userId;
            this.taskId = taskId;
            this.priority = priority;
        }
        
        @Override
        public int compareTo(Task other) {
            if (this.priority != other.priority) {
                return Integer.compare(other.priority, this.priority);
            }
            return Integer.compare(other.taskId, this.taskId);
        }
    }

    PriorityQueue<Task> pq = new PriorityQueue<>();
    Map<Integer, Task> taskMap = new HashMap<>();

    public TaskManager(List<List<Integer>> tasks) {
        for(List<Integer> task : tasks) {
            add(task.get(0), task.get(1), task.get(2));
        }
    }
    
    public void add(int userId, int taskId, int priority) {
        Task task = new Task(userId, taskId, priority);
        pq.add(task);
        taskMap.put(taskId, task);
    }
    
    public void edit(int taskId, int newPriority) {
        Task task = taskMap.get(taskId);
        if (task != null) {
            Task updated = new Task(task.userId, taskId, newPriority);
            pq.add(updated);
            taskMap.put(taskId, updated);
        }
    }
    
    public void rmv(int taskId) {
        taskMap.remove(taskId);
    }
    
    public int execTop() {
        while(!pq.isEmpty()) {
            Task task = pq.peek();
            Task valid = taskMap.get(task.taskId);
        if(valid != null && valid.priority == task.priority) {
            pq.poll();
            taskMap.remove(valid.taskId);
            return valid.userId;
        } else {
            pq.poll();
        }
        }
        return -1;
    }
}

/**
 * Your TaskManager object will be instantiated and called as such:
 * TaskManager obj = new TaskManager(tasks);
 * obj.add(userId,taskId,priority);
 * obj.edit(taskId,newPriority);
 * obj.rmv(taskId);
 * int param_4 = obj.execTop();
 */