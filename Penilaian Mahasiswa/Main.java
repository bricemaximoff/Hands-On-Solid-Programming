package penilaianmahasiswa;
public class Main {
    public static void main(String[] args) {
        StudentGrader grader = new StudentGrader();
        GradeReport report = new GradeReport();
        GradeDatabase db = new GradeDatabase();

        double nilai = grader.hitungNilaiAkhir(80, 85, 90);
        report.cetakLaporan("Andi", nilai);
        db.simpanDatabase("Andi", nilai);
    }
}