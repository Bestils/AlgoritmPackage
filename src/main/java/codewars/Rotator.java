package codewars;

public class Rotator {

    public Object[] rotate(Object[] data, int n) {
        int position = 5-(n % data.length);
        if ( n>15){
            position=(position+2)%data.length;

        } else if ( n>10){
            position=(position+1)%data.length;

        }
        Object[] answerData = new Object[data.length];

        for (int i = 0; i < data.length; i++) {
            if (position > (-1)) {
                answerData[i] = data[(i + position) % data.length];
            } else {
                answerData[i] = data[(i + data.length + position) % data.length];
            }

        }
        return answerData;
    }
}
