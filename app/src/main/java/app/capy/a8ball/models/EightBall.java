package app.capy.a8ball.models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class EightBall {   List<Answer> answerList;
    Random random = new Random();


    public EightBall(List<Answer> answerList) {
        this.answerList = answerList;
    }

    public Answer makeRandom(List<Answer>answerList){
        int indexList = random.nextInt(answerList.size());
        Answer pickedAnswer = answerList.get(indexList);

        return pickedAnswer; }

    public List<Answer> doListMessage(Answer...messages){
        List<Answer>messageList = new ArrayList<>();
        for (Answer m : messages) {
            messageList.add(m);
        }

        return messageList;}

    @Override
    public String toString() {
        return "EightBall{" +
                "answerList=" + answerList +
                '}';
    }


    public List<Answer> getAnswerList() {
        return answerList;
    }

    public void setAnswerList(List<Answer> answerList) {
        this.answerList = answerList;
    }

}
