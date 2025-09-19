package MedicalReport;


public class MedicalReport {
    String patientName;
    String condition;
    String reportDate;
    String doctorNotes;


    MedicalReport(String patientName , String condition , String reportDate , String doctorNotes){

        this.patientName = patientName;
        this.condition =condition;
        this.reportDate = reportDate;
        this.doctorNotes = doctorNotes;

    }

    MedicalReport(MedicalReport m1 , String doctorNotes)
    {
        this.patientName = m1.patientName;
        this.condition = m1.condition;
        this.reportDate = m1.reportDate;
        this.doctorNotes = doctorNotes;
    }
    public  String  showReport()

    {
        return  "Patient Name : "+patientName+
                "\nCondition : "+condition+
                "\nReport Date : "+reportDate+
                "\nDoctor Notes : "+doctorNotes;
    }

    public static void main(String[] args) {
         MedicalReport patient1 = new MedicalReport("XYZ","Flu","12-18-2002","Prescribe rest and Fluids");
         MedicalReport patient2 = new MedicalReport(patient1,"Symptoms improving , continue medication");
        System.out.println(patient1.showReport());
        System.out.println();
        System.out.println(patient2.showReport());
    }
}
