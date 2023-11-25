package object1;

import java.util.Iterator;

public class studentDb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          student [] db = new student[3];
          db[0]=new student("raj",24,'M',89752121,"Nagpur");
          db[1]=new student("Om",21,'M',98754221,"Nanded");
          db[2]=new student("Jay",25,'M',956752121,"pune");
          
//          Display The Information Details of The student
          
//          for (int i = 0; i < db.length; i++) {
//			db[i].dispalyStudent();
//		}
          
//          Display the Specific infomrmation of student
          
//            for (int i = 0; i < db.length; i++) {
//				System.out.println(db[i].name);
//			}
          
//          Specific locatoin of the Student print
//          for (int i = 0; i < db.length; i++) {
//			if (db[i].loc=="Nanded") {
//				db[i].dispalyStudent();
//			}
//		}
	}

}
