package com.example.sudipto.justdiary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ExpandableListView.OnChildClickListener;
import android.widget.ExpandableListView.OnGroupClickListener;
import android.widget.ExpandableListView.OnGroupCollapseListener;
import android.widget.ExpandableListView.OnGroupExpandListener;
import android.widget.Toast;

public class info_desk extends AppBaseActivity {

    ExpandableListAdapter listAdapter;
    ExpandableListView expListView;
    List<String> listDataHeader;
    HashMap<String, List<String>> listDataChild;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_desk);

        // get the listview
        expListView = (ExpandableListView) findViewById(R.id.lvExp);

        // preparing list data
        prepareListData();

        listAdapter = new ExpandableListAdapter(this, listDataHeader, listDataChild);

        // setting list adapter
        expListView.setAdapter(listAdapter);

        // Listview Group click listener
        expListView.setOnGroupClickListener(new OnGroupClickListener() {

            @Override
            public boolean onGroupClick(ExpandableListView parent, View v,
                                        int groupPosition, long id) {
                // Toast.makeText(getApplicationContext(),
                // "Group Clicked " + listDataHeader.get(groupPosition),
                // Toast.LENGTH_SHORT).show();
                return false;
            }
        });

        // Listview Group expanded listener
//        expListView.setOnGroupExpandListener(new OnGroupExpandListener() {
//
//            @Override
//            public void onGroupExpand(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Expanded",
//                        Toast.LENGTH_SHORT).show();
//            }
//        });

        // Listview Group collasped listener
//        expListView.setOnGroupCollapseListener(new OnGroupCollapseListener() {
//
//            @Override
//            public void onGroupCollapse(int groupPosition) {
//                Toast.makeText(getApplicationContext(),
//                        listDataHeader.get(groupPosition) + " Collapsed",
//                        Toast.LENGTH_SHORT).show();
//
//            }
//        });

        // Listview on child click listener
        expListView.setOnChildClickListener(new OnChildClickListener() {

            @Override
            public boolean onChildClick(ExpandableListView parent, View v,
                                        int groupPosition, int childPosition, long id) {
                // TODO Auto-generated method stub
//                Toast.makeText(
//                        getApplicationContext(),
//                        listDataHeader.get(groupPosition)
//                                + " : "
//                                + listDataChild.get(
//                                listDataHeader.get(groupPosition)).get(
//                                childPosition), Toast.LENGTH_SHORT)
//                        .show();
                if (groupPosition==0){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","regentBoard");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","rg_member");
                        startActivity(intent);
                    }
                }if (groupPosition==1){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","regentBoard2");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","rg_member2");
                        startActivity(intent);
                    }
                }if (groupPosition==2){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","regentBoard3");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","auditCell");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","treasurer");
                        startActivity(intent);
                    }
                }if (groupPosition==3){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean1");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Computer");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Chemical");
                        startActivity(intent);
                    }if (childPosition==3){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Ipe");
                        startActivity(intent);
                    }if (childPosition==4){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Pme");
                        startActivity(intent);
                    }if (childPosition==5){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","EEE");
                        startActivity(intent);
                    }if (childPosition==6){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Bme");
                        startActivity(intent);
                    }if (childPosition==7){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","TE");
                        startActivity(intent);
                    }
                }if (groupPosition==4){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean2");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Microbiology");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Pharmacy");
                        startActivity(intent);
                    }if (childPosition==3){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Genetic");
                        startActivity(intent);
                    }if (childPosition==4){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Fisheries");
                        startActivity(intent);
                    }
                }if (groupPosition==5){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean3");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Environmental");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Nutrition");
                        startActivity(intent);
                    }if (childPosition==3){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Agro");
                        startActivity(intent);
                    }
                }if (groupPosition==6){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean4");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Mathematics");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Physics");
                        startActivity(intent);
                    }if (childPosition==3){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Chemistry");
                        startActivity(intent);
                    }
                }if (groupPosition==7){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean5");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","English");
                        startActivity(intent);
                    }
                }if (groupPosition==8){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean6");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Business_Studies");
                        startActivity(intent);
                    }if (childPosition==2){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Accounting");
                        startActivity(intent);
                    }if (childPosition==3){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Management");
                        startActivity(intent);
                    }if (childPosition==4){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Finance");
                        startActivity(intent);
                    }
                }if (groupPosition==9){
                    if (childPosition==0){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Dean7");
                        startActivity(intent);
                    }if (childPosition==1){
                        Intent intent = new Intent(getApplicationContext(),ProfileActivity.class);
                        intent.putExtra("name","Physical");
                        startActivity(intent);
                    }
                }
                return false;
            }
        });
    }

    /*
     * Preparing the list data
     */
    private void prepareListData() {
        listDataHeader = new ArrayList<String>();
        listDataChild = new HashMap<String, List<String>>();

        // Adding child data
        listDataHeader.add("Regent Board");
        listDataHeader.add("Academic Council");
        listDataHeader.add("Administrative Offices");
        listDataHeader.add("Faculty of Engineering and Technology");
        listDataHeader.add("Faculty of Biological Science and Technology");
        listDataHeader.add("Faculty of Applied Science and Technology");
        listDataHeader.add("Faculty of Science");
        listDataHeader.add("Faculty of Arts and Social Science");
        listDataHeader.add("Faculty of Business Studies");
        listDataHeader.add("Faculty of Health Science");

        // Adding child data
        List<String> regentBoard = new ArrayList<String>();
        regentBoard.add("Chairman");
        regentBoard.add("Member");

        List<String> academicCouncil = new ArrayList<String>();
        academicCouncil.add("Chairman");
        academicCouncil.add("Member");

        List<String> office = new ArrayList<String>();
        office.add("Office Of Vice Chancellor");
        office.add("Audit Cell");
        office.add("Office of the Treasurer ");
        office.add("Office of the Registrar");
        office.add("ICT CELL");
        office.add("Office of the Librarian");
        office.add("Student Hall");
        office.add("Sheikh Hasina Hall");
        office.add("Office of the Proctor");
        office.add("Office of the Student Counseling & Guidance");
        office.add("Office of the Medical Officer");

        List<String> Engineering = new ArrayList<String>();
        Engineering.add("Dean");
        Engineering.add("Computer Science and Engineering (CSE)");
        Engineering.add("Chemical Engineering (ChE)");
        Engineering.add("Industrial & Production Engineering (IPE)");
        Engineering.add("Petroleum & Mining Engineering (PME)");
        Engineering.add("Electrical and Electronic Engineering (EEE)");
        Engineering.add("Biomedical Engineering (BME)");
        Engineering.add("Textile Engineering (TE)");

        List<String> Biology = new ArrayList<String>();
        Biology.add("Dean");
        Biology.add("Microbiology(MB)");
        Biology.add("Pharmacy");
        Biology.add("Genetic engineering & Biotechnology (GEBT)");
        Biology.add("Fisheries & Marine Bioscience (FMB)");

        List<String> Applied = new ArrayList<String>();
        Applied.add("Dean");
        Applied.add("Environmental Science and Technology (EST)");
        Applied.add("Nutrition and Food Technology (NFT)");
        Applied.add("Agro Product Processing Technology (APPT)");

        List<String> Science = new ArrayList<String>();
        Science.add("Dean");
        Science.add("Mathematics");
        Science.add("Dept. of Physics");
        Science.add("Dept. of Chemistry");

        List<String> Arts = new ArrayList<String>();
        Arts.add("Dean");
        Arts.add("Department of English");


        List<String> Buisness = new ArrayList<String>();
        Buisness.add("Dean");
        Buisness.add("Accounting and Information Systems (AIS)");
        Buisness.add("Department of Management");
        Buisness.add("Department of Finance and Banking");

        List<String> Physical = new ArrayList<String>();
        Physical.add("Dean");
        Physical.add("Physical Education and Sports Science");


        listDataChild.put(listDataHeader.get(0), regentBoard); // Header, Child data
        listDataChild.put(listDataHeader.get(1), academicCouncil);
        listDataChild.put(listDataHeader.get(2), office);
        listDataChild.put(listDataHeader.get(3), Engineering);
        listDataChild.put(listDataHeader.get(4), Biology);
        listDataChild.put(listDataHeader.get(5), Applied);
        listDataChild.put(listDataHeader.get(6), Science);
        listDataChild.put(listDataHeader.get(7), Arts);
        listDataChild.put(listDataHeader.get(8), Buisness);
        listDataChild.put(listDataHeader.get(9), Physical);
    }
}