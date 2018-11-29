package main;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import controllers.FacadeController;
import controllers.FileLoadController;
import controllers.QueryController;
import dao.DataReaderSetting;
import dao.ProgrammeCsvReader;
import dao.TimetableData;
import dao.TimetableExcelDataReader;
import entities.Event;
import entities.EventType;
import entities.Module;
import entities.Programme;
import entities.Room;
import entities.TTSlot;
import entities.Staff;
import entities.StaffTimetable;
import entities.Student;
import entities.StudentTimetable;

@SuppressWarnings("unused")
public class StartUp
{
	public static void main(String[] args)
	{		
		String filePath = "H:\\Neil Urquhart\\TT-Data.xlsx";
		FacadeController facade = FacadeController.getInstance(filePath);
		StudentTimetable studenTT = facade.getTimetableForStudent("MATRIC NUMBER");
		StaffTimetable staffTT = facade.getTimetableForStaff("STAFF NAME HERE");
	}
}
