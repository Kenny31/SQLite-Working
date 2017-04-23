package com.example.android.databaseworking;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class GroupDetails extends AppCompatActivity {

    Button next;
    EditText groupName, groupLocation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.groupdetail);

        next = (Button) findViewById(R.id.nextButton);
        groupName = (EditText) findViewById(R.id.groupName);
        groupLocation = (EditText) findViewById(R.id.groupLocation);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = groupName.getText().toString();
                String location = groupLocation.getText().toString();
                Group group = new Group(name,location);
                GroupDatabaseHandler gd = new GroupDatabaseHandler(GroupDetails.this);
                gd.addGroup(group);
            }
        });
    }
}
