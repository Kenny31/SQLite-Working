package com.example.android.databaseworking;

/**
 * Created by prashant on 23/4/17.
 */

public class Group {

    String _name;
    String _location;

    public Group(String _name, String _location) {
        this._name = _name;
        this._location = _location;
    }

    public String get_name() {
        return _name;
    }

    public void set_name(String _name) {
        this._name = _name;
    }

    public String get_location() {
        return _location;
    }

    public void set_location(String _location) {
        this._location = _location;
    }
}
