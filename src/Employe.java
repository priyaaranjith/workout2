public class Employe {
    public String name;
    public int empId;
    public String result;
    public int percentage;
    public int ass1,ass2,ass3;
    public void employe(String name, String result){
        this.name=name;
        this.result=result;
    }

    public String calculate() {
        if((ass1>=75)&&(ass2>=75)&&(ass3>=75)) {
            result="Accepted";
            return result;
        }
        else {
            result="Demoted";
            return result;
        }
    }
    public int total(int ass1, int ass2, int ass3) {
        int total=ass1+ass2+ass3;
        return total;
    }

    public double percentage(int total) {


        double percentage=(total/3);
        return percentage;
    }
}






