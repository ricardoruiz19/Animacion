package com.example.ricardoruiz.animacion;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity implements View.OnClickListener {

    ImageView logo_android;
    TextView titulo;
    Button boton_girar;
    Button boton_ampliar;
    Button boton_mover;
    Button boton_trans;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        logo_android = (ImageView) findViewById(R.id.image_logo);
        titulo = (TextView) findViewById(R.id.text_title);
        boton_girar = (Button) findViewById(R.id.action_girar);
        boton_ampliar = (Button) findViewById(R.id.action_ampliar);
        boton_mover = (Button) findViewById(R.id.action_mover);
        boton_trans = (Button) findViewById(R.id.action_trans);

        boton_girar.setOnClickListener(this);
        boton_mover.setOnClickListener(this);
        boton_ampliar.setOnClickListener(this);
        boton_trans.setOnClickListener(this);

    }

    //@override public boolean oncreateoptionsmenu(menu menu){ getmenuinflater().inflate(r.menu.menu_main,menu); return true; }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();

        if (id == R.id.action_setting){
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.action_girar:

                Animation giro;
                giro = AnimationUtils.loadAnimation(this. R.animator.rotate);
                giro.reset();
                logo_android.startAnimation(giro);

                break;
            case R.id.action_mover:

                Animation movimiento;
                movimiento = AnimationUtils.loadAnimation(this. R.animator.mover);
                movimiento.reset();
                logo_android.startAnimation(movimiento);

                break;
            case R.id.action_ampliar:

                Animation aumentar;
                aumentar = AnimationUtils.loadAnimation(this. R.animator.ampliar);
                aumentar.reset();
                logo_android.startAnimation(aumentar);

                break;
            case R.id.action_trans:

                Animation transparencia;
                transparencia = AnimationUtils.loadAnimation(this. R.animator.transparentar);
                transparencia.reset();
                logo_android.startAnimation(transparencia);

                break;

            default:

                break;
        }
    }
}
