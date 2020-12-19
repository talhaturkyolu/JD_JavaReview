package com.cybertek.streams.exercises;

import com.cybertek.enums.Gender;
import com.cybertek.enums.Status;
import com.cybertek.oop.encapsulation.User;
import com.cybertek.oop.inheritance.Project;

import java.time.Period;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

    // Task -1
    public static List<Project> getListOfProject(){
        List<Project> listOfProjects = DataGenerator.getProjects();
        return listOfProjects;
    }



    // Task -2
    public static List<Project> getListOfProject(Status status){
        List<Project> projectList = DataGenerator.getProjects();
        return projectList.stream().filter(project -> project.equals(status)).collect(Collectors.toList());
    }



    // Task -3
    public static List<Project> getListOfProject(User manager){
        List<Project> projectList = DataGenerator.getProjects();
        return projectList.stream().filter(mngr -> mngr.getAssignedManager().equals(mngr)).collect(Collectors.toList());
    }




    // Task -4
    public static List<Project> getProjectByProjectCode(String projectCode ){
        List<Project> projects = DataGenerator.getProjects();
        return projects.stream().filter(project -> project.getProjectCode().equals(projectCode)).collect(Collectors.toList());
    }




    // Task -5
    public static List<User> getListUsers(){
        List<User> users = DataGenerator.getUsers();
        return users;

    }




    // Task -6
    public static User getUserByFirstName(String firstName){
        List<User> users = DataGenerator.getUsers();
        return users.stream().filter(user -> user.getFirstName().equals(firstName)).findFirst().get();
    }




    /* Task -7
    public static String getUserByUserId(Long id){

    }

     */





    // Task -8
    public static List<User> deleteUser(String firstName){
        List<User> users = DataGenerator.getUsers();
        return users.stream().filter(user -> !user.getFirstName().equals(firstName)).collect(Collectors.toList());
    }




    // Task -9
    public static List<Project> updateProjectStatus(Status oldStatus, Status newStatus){
        List<Project> status = DataGenerator.getProjects();
        status.stream().filter(st -> st.getProjectStatus().equals(oldStatus)).forEach(project -> project.setProjectStatus(newStatus));
        return status;
    }



    /* Task -10
    public static List<Project> findProjectByManager(User manager){

    }

     */




    // Task -11 - Period
    public static Integer totalProjectDurationForManager(User manager){
        List<Project> listOfProjects = DataGenerator.getProjects();
        Project p = listOfProjects.stream().filter(mn -> mn.getAssignedManager().equals(manager)).findFirst().get();
//        long diffInMillies = Math.abs(p.getEndDate() - p.getStartDate());
//        long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
        Period period = Period.between(p.getStartDate(), p.getEndDate());
        return (int) (long) period.getDays();
    }




    // Task -12
    public static long findTotalMaleInCompany(){
        List<User> allusers = DataGenerator.getUsers();
        return allusers.stream().filter(user -> user.getGender().equals(Gender.MALE)).count();
    }


}
