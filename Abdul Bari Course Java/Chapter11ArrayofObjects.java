

class Subject1{
    private String subId;
    private String name;
    private int maxMarks;
    private int obtainedMarks;

    public Subject1(String subId,String name,int maxMarks){
        this.subId = subId;
        this.name = name;
        this.maxMarks = maxMarks;
    }
    // Getters
    public String getSubId(){return subId;}
    public String getName(){return name;}
    public int getMaxMarks(){return maxMarks;}
    public int getObtainedMarks(){return obtainedMarks;}
    //Setters
    public void setMaxMarks(int a){
        maxMarks = a;
    }
    public void setObtainedMarks(int a){
        obtainedMarks = a;
    }
    public boolean isQualified(int marks){
        if (marks>=40) return true;
        else return false;
    }
}
public class Chapter11ArrayofObjects {
    public static void main(String[] args) {
        //Array of objects
        Subject1 sub[] = new Subject1[3];
        sub[0] = new Subject1("s101", "Maths", 100);
        sub[1] = new Subject1("s102","Science",100);
        sub[2] = new Subject1("s103", "English", 100);
     }
}
