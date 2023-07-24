package cc.robotdreams;

import java.util.ArrayList;
import java.util.List;

public class StudentsGroup
{
        private Student groupLeader;
        private List<Student> students;
        private List<String> tasks;

        public StudentsGroup(Student groupLeader){
            this.groupLeader = groupLeader;
            this.students = new ArrayList<>();
            this.tasks = new ArrayList<>();
        }

        public void changeGroupLeader(Student newGroupLeader){
            this.groupLeader = newGroupLeader;
        }

        public void addStudent(Student student){
            students.add(student);
        }

        public void removeStudent(Student student){
            students.remove(student);
        }

        public void addTask(String task){
            tasks.add(task);
        }

        public void markTaskAsDone(Student student, String task){
            if (students.contains(student) && tasks.contains(task)){

            }
        }

}
