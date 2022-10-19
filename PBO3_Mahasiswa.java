public class PBO3_Mahasiswa {
    int jumlah_mahasiswa = 0;
    String nim, nama, grade;
    int nilai;

    public PBO3_Mahasiswa(String nim, String nama, int nilai){
        this.nim = nim;
        this.nama = nama;
        this.nilai = nilai;
        this.jumlah_mahasiswa += 1;
    }
    
    public int getJumlahMahasiswa(){
        return this.jumlah_mahasiswa;
    }
    
    public String getNim(){
        return nim;
    }
    
    public void setNim(String nim){
        this.nim = nim;
    }
    
    public void setNama(String nama){
        this.nama = nama;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNilai(int nilai){
        this.nilai = nilai;
    }
    
    public int getNilai(){
        return nilai;
    }
    
    public void SetGrade(){
        if(getNilai() <= 100 && getNilai() >= 80){
            setGrade("A");
        }
        else if(getNilai() <= 79 && getNilai() >= 70){
            setGrade("B");
        }
        else if(getNilai() <= 69 && getNilai() >= 60){
            setGrade("C");
        }
        else if(getNilai() <= 59 && getNilai() >= 50){
            setGrade("D");
        }
        else if(getNilai() <= 50 && getNilai() >= 0){
            setGrade("E");
        }
        else{
            setGrade("ERROR");
        }        
    }
    public void setGrade(String grade){
        this.grade = grade;
    }
    public String getGrade(){
        return this.grade;
    }
         

    public void output_mahasiswa(){
        System.out.println("NIM\t : " + getNim());
        System.out.println("Nama\t : " + getNama());
        System.out.println("Nilai\t : " + getNilai());
        SetGrade();
        
        System.out.println("Grade\t : " + getGrade());
    }
}