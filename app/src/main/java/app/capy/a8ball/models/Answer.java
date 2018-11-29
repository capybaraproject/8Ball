package app.capy.a8ball.models;

import java.util.ArrayList;
import java.util.List;

public class Answer {
    private String answer;


    public Answer() {
    }

    public Answer(String answer) {
        this.answer = answer;
    }

    public List<Answer> doListMessage(Answer...messages){
        List<Answer>messageList = new ArrayList<>();
        for (Answer m : messages) {
            messageList.add(m);
        }

        return messageList;}

    public List<Answer>getDefaultList(List<Answer>defaultList){

        Answer answer1 = new Answer("It is certain.");
        Answer answer2 = new Answer("It is decidedly so.");
        Answer answer3 = new Answer(" Without a doubt.");
        Answer answer4 = new Answer("Yes - definitely.");
        Answer answer5 = new Answer(" You may rely on it.");
        Answer answer6 = new Answer("As I see it, yes.");
        Answer answer7 = new Answer(" Most likely.");
        Answer answer8 = new Answer("Outlook good.");
        Answer answer9 = new Answer("Yes.");
        Answer answer10 = new Answer("Signs point to yes.");
        Answer answer11 = new Answer("Reply hazy, try again.");
        Answer answer12 = new Answer(" Ask again later.");
        Answer answer13 = new Answer("Better not tell you now.");
        Answer answer14 = new Answer("Cannot predict now.");
        Answer answer15 = new Answer("Concentrate and ask again.");
        Answer answer16 = new Answer("Don't count on it.");
        Answer answer17 = new Answer("My reply is no.");
        Answer answer18 = new Answer(" My sources say no.");
        Answer answer19 = new Answer(" Outlook not so good.");
        Answer answer20 = new Answer("Very doubtful.");
        defaultList = doListMessage(answer1,answer2,answer3,answer4,answer5,answer6,answer7,
                answer8,answer9,answer10,answer11,answer12,answer13,answer14,answer15,answer16,answer17,answer18,
                answer19,answer20);



        return defaultList;}



    @Override
    public String toString() {
        return "Message{" +
                "answer='" + answer + '\'' +
                '}';
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

}


