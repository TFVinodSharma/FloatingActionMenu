package com.android.ejsoft.flotingmenu;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;
import com.github.clans.fab.FloatingActionMenu;

import static com.android.ejsoft.flotingmenu.R.mipmap.oku_icn;

public class MainActivity extends AppCompatActivity {


    FloatingActionMenu materialDesignFAM;
    FloatingActionButton floatingActionButton1, floatingActionButton2, floatingActionButton3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        materialDesignFAM = (FloatingActionMenu) findViewById(R.id.material_design_android_floating_action_menu);
        materialDesignFAM.setIconAnimated(false);
        materialDesignFAM.setOnMenuButtonClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (materialDesignFAM.isOpened()) {
                    // We will change the icon when the menu opens, here we want to change to the previous icon
                    materialDesignFAM.close(true);
                   // materialDesignFAM.getMenuIconView().setImageDrawable(oku_icn);
                    materialDesignFAM.getMenuIconView().setImageResource(R.mipmap.oku_icn_main);
                } else {
                    materialDesignFAM.getMenuIconView().setImageResource(R.mipmap.oku_icn);

                    // Since it is closed, let's set our new icon and then open the menu
                  //  materialDesignFAM.getMenuIconView().setImageDrawable(drawableManager.getDrawable(getActivity(), R.drawable.ic_edit_24dp));
                    materialDesignFAM.open(true);
                }
            }
        });
/*
        materialDesignFAM.setOnMenuToggleListener(new FloatingActionMenu.OnMenuToggleListener() {
            @TargetApi(Build.VERSION_CODES.N)
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onMenuToggle(boolean opened) {
                materialDesignFAM.setPointerIcon(oku_icn);
            }
        });
*/
        floatingActionButton2 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item2);
        floatingActionButton3 = (FloatingActionButton) findViewById(R.id.material_design_floating_action_menu_item3);

        floatingActionButton2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu second item clicked
                Toast.makeText(MainActivity.this, "floatingActionButton2", Toast.LENGTH_SHORT).show();

            }
        });
        floatingActionButton3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //TODO something when floating action menu third item clicked
                Toast.makeText(MainActivity.this, "floatingActionButton3", Toast.LENGTH_SHORT).show();

            }
        });

    }
}
