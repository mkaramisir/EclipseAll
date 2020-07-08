package lambda2020;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Lambda12 {

	public static void main(String[] args) {
		  Course courseTurkishDay = new Course("Summer", "Turkish Day", 97, 128);
	        Course courseTurkishNight = new Course("Winter", "Turkish Night", 98, 154);
	        Course courseEnglishDay = new Course("Spring", "English Day", 95, 132);
	        Course courseEnglishNight = new Course("Winter", "English Night", 93, 144);
	        
	        List<Course> courseList = new ArrayList<>();
	        courseList.add(courseTurkishDay);
	        courseList.add(courseTurkishNight);
	        courseList.add(courseEnglishDay);
	        courseList.add(courseEnglishNight);
	        System.out.println(courseList);
	        
	        //Check if all average scores are more than 90
	        System.out.println(courseList.stream()
	                  .allMatch(t->t.getAverageScore()>90)); //true
	        
	        //Check if all course names contains the word "Day"
	        System.out.println(courseList.stream()
	                  .allMatch(t->t.getCourseName().contains("Day"))); //false
	        
	        //Check if any number of students is 154
	        System.out.println(courseList.stream()
	                  .anyMatch(t->t.getNumberOfStudents()==154));//true
	        
	        //Check if any season contains "Winter"
	        System.out.println(courseList.stream()
	                  .anyMatch(t->t.getSeason().contains("Winter"))); //true
	        
	        //Check if no number of students is equal to 0
	        System.out.println(courseList.stream()
	                  .noneMatch(t->t.getNumberOfStudents()==0));//true
	        
	    
	        //Sort the list elements according to the number of students
	        Comparator<Course> comparatorForNumOfStudents = Comparator.comparing(Course::getNumberOfStudents);
	        System.out.println(courseList.stream()
	                                     .sorted(comparatorForNumOfStudents)
	                                     .collect(Collectors.toList()));
	        
	        //Sort the elements according to the name of the course in reversed order
	        Comparator<Course> comparatorForNameOfCourse = Comparator.comparing(Course::getCourseName).reversed();
	        System.out.println(courseList.stream()
	                                     .sorted(comparatorForNameOfCourse)
	                                     .collect(Collectors.toList()));
	        
	        //Sort the elements by using season and average score
	        Comparator<Course> comparatorForSeasonAndScore = Comparator.comparing(Course::getSeason).thenComparing(Course::getAverageScore);
	        System.out.println(courseList.stream()
	                                     .sorted(comparatorForSeasonAndScore)
	                                     .limit(3) // If you want to see just 3 elements use limit(3)
	                                     .collect(Collectors.toList()));
	        
	        //Print the element whose number of students is maximum on the console by using sort and limit methods.
	        Comparator<Course> comparatorForMaxNumOfStudents = Comparator.comparing(Course::getNumberOfStudents).reversed();
	        System.out.println(courseList.stream()
	                                     .sorted(comparatorForMaxNumOfStudents)
	                                     .limit(1)
	                                     .collect(Collectors.toList()));
	        
	        //Print the element whose number of students is second maximum on the console by using sort and limit methods.
	        Comparator<Course> comparatorForSecondMaxNumOfStudents = Comparator.comparing(Course::getNumberOfStudents).reversed();
	        System.out.println(courseList.stream()
	                                     .sorted(comparatorForSecondMaxNumOfStudents)
	                                     .skip(1) //If you skip some elements use skip() with the number of elements
	                                     .limit(1)
	                                     .collect(Collectors.toList()));
	        
	        //Find the first element
	        System.out.println(courseList.stream().findFirst()); 
	        
	        //Find the any element
	        System.out.println(courseList.stream().findAny()); //it is free to select any element in the stream. 
	        
	        //Find the sum of the number of students whose average scores are more than 95
	        System.out.println(courseList.stream()
	                                     .filter(t->t.getAverageScore()>95)
	                                     .mapToInt(Course::getNumberOfStudents)// mapToInt() method converts stream values to integers
	                                     .sum());
	                  
	        //Find the average of the number of students whose average scores are more than 93
	        System.out.println(courseList.stream()
	                                     .filter(t->t.getAverageScore()>93)
	                                     .mapToDouble(Course::getNumberOfStudents)
	                                     .average()); //138 ==> (128 + 154 + 132)/3 = 138
	        
	        //Find the number of courses whose average scores are more than 93
	        System.out.println(courseList.stream()
	                                     .filter(t->t.getAverageScore()>93)
	                                     .count());//3
	        
	        //Group the courses according to the season
	        System.out.println(courseList.stream()
	                                     .collect(Collectors.groupingBy(Course::getSeason)));
	        
	        //Find the numbers of the courses according to the season
	        System.out.println(courseList.stream()
	                                     .collect(Collectors.groupingBy(Course::getSeason, Collectors.counting())));
	        
	        //Find the number of courses according to the course name.
	        System.out.println(courseList.stream()
	                                     .collect(Collectors.groupingBy(Course::getCourseName, Collectors.counting())));

	}
}
