package day50;

//public abstract class Question {
//
//    int num1;
//    int num2;
//    String operator;
//    int answer;
//    boolean calculated;
//    String questionType = "Unknown"; // setting default value to unknown directly here to avoid null
//    public abstract void calculate();
//
//    public Question(String operator, String questionType) {
//        this.operator = operator;
//        this.questionType = questionType;
//    }
//
//    @Override
//    public String toString() {
//        return "The question type is " + questionType;
//    }
//}
public abstract class Question{
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";

    public abstract void calculate();

    public Question (String questionType, String operator){
        this.questionType = questionType;
        this.operator = operator;
    }

    public String toString(){
        return "The question type is " + questionType + " : ";
    }

}
//We will create 2nd grade math Question program
//Question is abstract idea
//	and we will represent it by Abstract class here
//	it has below fields :
//		 int num1
//		 int num2
//		 String operator
//		 int answer
//		 boolean calculated
//		 String questionType = "Unknown"
//	abstract void method calculate();
//	Constructor to set
//		Question type and Operator
//	toString method to return this question is + questionType
//	Create sub class Addition
//		it has one constructor to set
//			num1 and num2
//			it should also set questionType to "addition"
//								operator to  "+"
//		it should implement calculate method
//		toString method in below format
//			return num1 + operator +  num2  =  "" if not calculated yet
//			return num1 + operator +  num2  =  answer if already calculated
