package com.example.transleter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

public class StartActivity extends AppCompatActivity {
    private SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        pref = getSharedPreferences("myPref", MODE_PRIVATE);
        SharedPreferences.Editor editor = pref.edit();
        Intent i = new Intent(StartActivity.this, MainActivity.class);

        if (pref.contains("first")){
            startActivity(i);
        }else {
            editor.putBoolean("first", true);
            editor.putString("машина", "https://media.spreadthesign.com/video/mp4/12/345841.mp4");
            editor.putString("ад", "https://media.spreadthesign.com/video/mp4/12/349210.mp4");
            editor.putString("адрес", "https://media.spreadthesign.com/video/mp4/12/4380.mp4");
            editor.putString("азия", "https://media.spreadthesign.com/video/mp4/12/351481.mp4");
            editor.putString("америка", "https://media.spreadthesign.com/video/mp4/12/349176.mp4");
            editor.putString("англия", "https://media.spreadthesign.com/video/mp4/12/16122.mp4");
            editor.putString("аромат", "https://media.spreadthesign.com/video/mp4/12/349232.mp4");
            editor.putString("африка", "https://media.spreadthesign.com/video/mp4/12/12723.mp4");
            editor.putString("бедный", "https://media.spreadthesign.com/video/mp4/12/16849.mp4");
            editor.putString("бейгел", "https://media.spreadthesign.com/video/mp4/12/349195.mp4");
            editor.putString("беларусь", "https://media.spreadthesign.com/video/mp4/12/351482.mp4");
            editor.putString("близнецы", "https://media.spreadthesign.com/video/mp4/12/14376.mp4");
            editor.putString("богатый", "https://media.spreadthesign.com/video/mp4/12/16852.mp4");
            editor.putString("болгария", "https://media.spreadthesign.com/video/mp4/12/443579.mp4");
            editor.putString("брат", "https://media.spreadthesign.com/video/mp4/12/345840.mp4");
            editor.putString("брюки", "https://media.spreadthesign.com/video/mp4/12/14784.mp4");
            editor.putString("бумага", "https://media.spreadthesign.com/video/mp4/12/12946.mp4");
            editor.putString("бутерброд", "https://media.spreadthesign.com/video/mp4/12/11336.mp4");
            editor.putString("бюстгальтер", "https://media.spreadthesign.com/video/mp4/12/14943.mp4");
            editor.putString("венгрия", "https://media.spreadthesign.com/video/mp4/12/43659.mp4");
            editor.putString("весна", "https://media.spreadthesign.com/video/mp4/12/13246.mp4");
            editor.putString("вечер", "https://media.spreadthesign.com/video/mp4/12/5574.mp4");
            editor.putString("вода", "https://media.spreadthesign.com/video/mp4/12/12530.mp4");
            editor.putString("вонять", "https://media.spreadthesign.com/video/mp4/12/349218.mp4");
            editor.putString("вопрос", "https://media.spreadthesign.com/video/mp4/12/18183.mp4");
            editor.putString("воскресенье", "https://media.spreadthesign.com/video/mp4/12/4288.mp4");
            editor.putString("время", "https://media.spreadthesign.com/video/mp4/12/4463.mp4");
            editor.putString("вторник", "https://media.spreadthesign.com/video/mp4/12/17366.mp4");
            editor.putString("вчера", "https://media.spreadthesign.com/video/mp4/12/4214.mp4");
            editor.putString("выживать", "https://media.spreadthesign.com/video/mp4/12/349219.mp4");
            editor.putString("германия", "https://media.spreadthesign.com/video/mp4/12/351484.mp4");
            editor.putString("гитара", "https://media.spreadthesign.com/video/mp4/12/349240.mp4");
            editor.putString("глухой", "https://media.spreadthesign.com/video/mp4/12/4047.mp4");
            editor.putString("глухота", "https://media.spreadthesign.com/video/mp4/12/349201.mp4");
            editor.putString("год", "https://media.spreadthesign.com/video/mp4/12/5297.mp4");
            editor.putString("голландия", "https://media.spreadthesign.com/video/mp4/12/443644.mp4");
            editor.putString("город", "https://media.spreadthesign.com/video/mp4/12/4049.mp4");
            editor.putString("горшок", "https://media.spreadthesign.com/video/mp4/12/10826.mp4");
            editor.putString("греция", "https://media.spreadthesign.com/video/mp4/12/16013.mp4");
            editor.putString("грустный", "https://media.spreadthesign.com/video/mp4/12/14670.mp4");
            editor.putString("губа", "https://media.spreadthesign.com/video/mp4/12/349231.mp4");
            editor.putString("дания", "https://media.spreadthesign.com/video/mp4/12/15709.mp4");
            editor.putString("двоюродной брат", "https://media.spreadthesign.com/video/mp4/12/14329.mp4");
            editor.putString("двоюродная сестра", "https://media.spreadthesign.com/video/mp4/12/14329.mp4");
            editor.putString("девочка", "https://media.spreadthesign.com/video/mp4/12/4105.mp4");
            editor.putString("день рождения", "https://media.spreadthesign.com/video/mp4/12/18681.mp4");
            editor.putString("дерево", "https://media.spreadthesign.com/video/mp4/12/39508.mp4");
            editor.putString("джем", "https://media.spreadthesign.com/video/mp4/12/9641.mp4");
            editor.putString("динозавр", "https://media.spreadthesign.com/video/mp4/12/349198.mp4");
            editor.putString("дискотека", "https://media.spreadthesign.com/video/mp4/12/43571.mp4");
            editor.putString("дом", "https://media.spreadthesign.com/video/mp4/12/349172.mp4");
            editor.putString("домашнее животное", "https://media.spreadthesign.com/video/mp4/12/349216.mp4");
            editor.putString("друг", "https://media.spreadthesign.com/video/mp4/12/351476.mp4");
            editor.putString("духовка", "https://media.spreadthesign.com/video/mp4/12/349181.mp4");
            editor.putString("душиться", "https://media.spreadthesign.com/video/mp4/12/349215.mp4");
            editor.putString("благоухать", "https://media.spreadthesign.com/video/mp4/12/349215.mp4");
            editor.putString("пахнуть приятно", "https://media.spreadthesign.com/video/mp4/12/349215.mp4");
            editor.putString("пахнуть", "https://media.spreadthesign.com/video/mp4/12/349215.mp4");
            editor.putString("дядя", "https://media.spreadthesign.com/video/mp4/12/14306.mp4");
            editor.putString("Египет", "https://media.spreadthesign.com/video/mp4/12/349189.mp4");
            editor.putString("еда", "https://media.spreadthesign.com/video/mp4/12/9110.mp4");
            editor.putString("есть", "https://media.spreadthesign.com/video/mp4/12/8842.mp4");
            editor.putString("жестовый язык", "https://media.spreadthesign.com/video/mp4/12/6184.mp4");
            editor.putString("жечь", "https://media.spreadthesign.com/video/mp4/12/7692.mp4");
            editor.putString("гореть", "https://media.spreadthesign.com/video/mp4/12/7692.mp4");
            editor.putString("жёлтый", "https://media.spreadthesign.com/video/mp4/12/5776.mp4");
            editor.putString("забота", "https://media.spreadthesign.com/video/mp4/12/27049.mp4");
            editor.putString("завтра", "https://media.spreadthesign.com/video/mp4/12/4186.mp4");
            editor.putString("завтрак", "https://media.spreadthesign.com/video/mp4/12/4316.mp4");
            editor.putString("здоровье", "https://media.spreadthesign.com/video/mp4/12/27606.mp4");
            editor.putString("зебра", "https://media.spreadthesign.com/video/mp4/12/43103.mp4");
            editor.putString("зелёный", "https://media.spreadthesign.com/video/mp4/12/5717.mp4");
            editor.putString("зима", "https://media.spreadthesign.com/video/mp4/12/13275.mp4");
            editor.putString("зубная боль", "https://media.spreadthesign.com/video/mp4/12/349243.mp4");
            editor.putString("болит зуб", "https://media.spreadthesign.com/video/mp4/12/349243.mp4");
            editor.putString("зубы", "https://media.spreadthesign.com/video/mp4/12/349242.mp4");
            editor.putString("зуб", "https://media.spreadthesign.com/video/mp4/12/349242.mp4");
            editor.putString("известный", "https://media.spreadthesign.com/video/mp4/12/23004.mp4");
            editor.putString("израиль", "https://media.spreadthesign.com/video/mp4/12/349180.mp4");
            editor.putString("имя", "https://media.spreadthesign.com/video/mp4/12/4027.mp4");
            editor.putString("индия", "https://media.spreadthesign.com/video/mp4/12/349212.mp4");
            editor.putString("интернет", "https://media.spreadthesign.com/video/mp4/12/4695.mp4");
            editor.putString("иордания", "https://media.spreadthesign.com/video/mp4/12/349226.mp4");
       /*     editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
            editor.putString("", "");
      */      editor.putString("", "");
            editor.apply();
            startActivity(i);
        }
    }
}