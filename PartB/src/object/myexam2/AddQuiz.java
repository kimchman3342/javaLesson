package object.myexam2;

public class AddQuiz {

    private int data1;
    private int data2;
    private int userAnswer;
    

    //getter
    public int getData1() {
        return data1;
    }

    public int getData2() {
        return data2;
    }

    public int getUserAnswer() {
        return userAnswer;
    }


    
    
    //setter
    public void setData1(int data1) {
        this.data1 = data1;
    }
    
    public void setData2(int data2) {
        this.data2 = data2;
    }

    public void setUserAnswer(int userAnswer) {
        this.userAnswer = userAnswer;
    }

    public boolean isRight(){
        boolean result = false;
        if(data1 + data2 == userAnswer) result = true;
        return result;
    }
    
    

    
    
   
}
