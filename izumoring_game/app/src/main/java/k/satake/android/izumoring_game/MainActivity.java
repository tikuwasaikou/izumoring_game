package k.satake.android.izumoring_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int seikai = 0;

    int[] resources;

    Button[] buttons;

    Izumo[] izumos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resources = new int[] {
                R.id.button1, R.id.button2, R.id.button3, R.id.button4, R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9, R.id.button10,
                R.id.button11, R.id.button12, R.id.button13, R.id.button14, R.id.button15, R.id.button16, R.id.button17, R.id.button18, R.id.button19, R.id.button20, R.id.button21, R.id.button22, R.id.button23, R.id.button24,
                R.id.button25, R.id.button26, R.id.button27, R.id.button28,R.id.button29, R.id.button30, R.id.button31, R.id.button32, R.id.button33, R.id.button34
        };

        buttons = new Button[resources.length];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = (Button) findViewById(resources[i]);
        }

        izumos = new Izumo[resources.length];
        for (int i = 0; i < resources.length; i++) {
            izumos[i] = new Izumo(0, 0, buttons[i]);
        }
    }

    public void change(View v) {

        switch (Integer .parseInt((String)v.getTag())) {
            case 1:
                izumos[0].changeColor(1);
                break;
            case 2:
                izumos[1].changeColor(1);
                break;
            case 3:
                izumos[2].changeColor(1);
                break;
            case 4:
                izumos[3].changeColor(1);
                break;
            case 5:
                izumos[4].changeColor(1);
                break;
            case 6:
                izumos[5].changeColor(1);
                break;
            case 7:
                izumos[6].changeColor(1);
                break;
            case 8:
                izumos[7].changeColor(1);
                break;
            case 9:
                izumos[8].changeColor(1);
                break;
            case 10:
                izumos[9].changeColor(1);
                break;
            case 11:
                izumos[10].changeColor(1);
                break;
            case 12:
                izumos[11].changeColor(1);
                break;
            case 13:
                izumos[12].changeColor(1);
                break;
            case 14:
                izumos[13].changeColor(1);
                break;
            case 15:
                izumos[14].changeColor(1);
                break;
            case 16:
                izumos[15].changeColor(1);
                break;
            case 17:
                izumos[16].changeColor(2);
                break;
            case 18:
                izumos[17].changeColor(2);
                break;
            case 19:
                izumos[18].changeColor(2);
                break;
            case 20:
                izumos[19].changeColor(2);
                break;
            case 21:
                izumos[20].changeColor(2);
                break;
            case 22:
                izumos[21].changeColor(2);
                break;
            case 23:
                izumos[22].changeColor(2);
                break;
            case 24:
                izumos[23].changeColor(2);
                break;
            case 25:
                izumos[24].changeColor(3);
                break;
            case 26:
                izumos[25].changeColor(3);
                break;
            case 27:
                izumos[26].changeColor(3);
                break;
            case 28:
                izumos[27].changeColor(3);
                break;
            case 29:
                izumos[28].changeColor(3);
                break;
            case 30:
                izumos[29].changeColor(3);
                break;
            case 31:
                izumos[30].changeColor(3);
                break;
            case 32:
                izumos[31].changeColor(3);
                break;
            case 33:
                izumos[32].changeColor(3);
                break;
            case 34:
                izumos[33].changeColor(3);
                break;
        }
    }

    public void result(View v) {
        seikai = 0;
        for (int i = 0; i < izumos.length; i++) {
            if (izumos[i].answerColor == izumos[i].cnt) {
                seikai += 1;
            }
        }

       // Intent intent = new Intent(this, ResultActivity.class);
        Toast.makeText(this, seikai + "", Toast.LENGTH_SHORT).show();
    }
}

class Izumo {

    int answerColor;

    int cnt;

    Button b;

    Izumo(int color, int cnt, Button b) {
        this.answerColor = color;
        this.cnt = cnt;
        this.b = b;
    }

    public void changeColor(int result) {
        cnt += 1;

        answerColor = result;

        switch (cnt) {
            case 1:
                b.setBackgroundResource(R.drawable.cap_circle_red);
                break;
            case 2:
                b.setBackgroundResource(R.drawable.cap_circle_blue);
                break;
            case 3:
                b.setBackgroundResource(R.drawable.cap_circle_yellow);
                break;
            default:
                b.setBackgroundResource(R.drawable.cap_circle_white);
                cnt = 0;
                break;
        }
    }
}

