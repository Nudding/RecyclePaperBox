package com.my.recyclepaper;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if(id == R.id.action_user_measureweight) {
            Intent it = new Intent(this, User_MeasureWeight.class);
            startActivity(it);
//            finish();
            return true;
        }else if(id==R.id.action_user_register){
            Intent it = new Intent(this, User_Register.class);
            startActivity(it);
            //finish();
            return true;
        }else if(id==R.id.action_user_returnpoint){
            Intent it = new Intent(this, User_ReturnPoint.class);
            startActivity(it);
            //finish();
            return true;
        }else if(id==R.id.action_login){
            Intent it = new Intent(this, Login.class);
            startActivity(it);
            //finish();
            return true;
        }else if(id==R.id.action_admin){
            Intent it = new Intent(this, Admin.class);
            startActivity(it);
            //finish();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}