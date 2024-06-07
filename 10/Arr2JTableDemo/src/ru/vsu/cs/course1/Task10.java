package ru.vsu.cs.course1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task10 {
/////////////////////lambda func
    private static List<Student> getFirstWave(List<Student> abiturients, int countOfBudgetPlaces) {
        abiturients.sort((student1,student2)->{
            int scoreCompare = Integer.compare(student2.getTotalScore(), student1.getTotalScore());
            if (scoreCompare != 0) {
                return scoreCompare;
            }
            int mathCompare = Integer.compare(student2.getMathScore(), student1.getMathScore());
            if (mathCompare != 0) {
                return mathCompare;
            }
            return Integer.compare(student2.getPhysicScore(), student1.getPhysicScore());
        });
        List<Student> firstWave = new ArrayList<>();
        for (Student s : abiturients) {
            if (s.getHasOriginalCertificate()) {
                firstWave.add(s);
            }
            if (firstWave.size() == countOfBudgetPlaces) {
                break;
            }
        }
        return firstWave;
    }

    public static List<Student> task(List<Student> abiturients,  int countOfBudgetPlaces) {
        return getFirstWave(abiturients, countOfBudgetPlaces);
    }
}
