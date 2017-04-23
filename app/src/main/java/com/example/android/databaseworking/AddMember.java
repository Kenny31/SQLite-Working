package com.example.android.databaseworking;

/**
 * Created by prashant on 23/4/17.
 */

public class AddMember {
    String _groupname;
    String _name;
    String _dob;
    String _address;

    public AddMember(String _groupname, String _name, String _dob, String _address) {
        this._groupname = _groupname;
        this._name = _name;
        this._dob = _dob;
        this._address = _address;
    }

    public String get_groupname() {
        return _groupname;
    }

    public void set_groupname(String _groupname) {
        this._groupname = _groupname;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_dob() {
        return _dob;
    }

    public void set_dob(String _dob) {
        this._dob = _dob;
    }

    public String get_address() {
        return _address;
    }

    public void set_address(String _address) {
        this._address = _address;
    }
}
