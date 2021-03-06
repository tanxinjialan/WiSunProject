package com.tanxinjialan.wisunproject;

/**
 * Created by snss-snsppo-sat on 6/6/17.
 */

class Contact {
    private final int case_no;
    private final String time_lodged;
    private final String last_update;
    private final String id;
    private final int contact_no;
    private final String district;
    private final String type;
    private final String block_name;
    private final String address;
    private final String unit_no;
    private final String postal_code;
    private final double lat;
    private final double lng;
    private String status;

    public Contact(int case_no, String time_lodged, String last_update,
                   String status, String id, int contact_no, String district,
                   String type, String block_name, String address, String unit_no,
                   String postal_code, double lat, double lng) {
        this.case_no = case_no;
        this.time_lodged = time_lodged;
        this.last_update = last_update;
        this.status = status;
        this.id = id;
        this.contact_no = contact_no;
        this.district = district;
        this.type = type;
        this.block_name = block_name;
        this.address = address;
        this.unit_no = unit_no;
        this.postal_code = postal_code;
        this.lat = lat;
        this.lng = lng;
    }

    public int getCase_no() {
        return case_no;
    }

    public String getTime_lodged() {
        return time_lodged;
    }

    public String getLast_update() {
        return last_update;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public int getContact_no() {
        return contact_no;
    }

    public String getDistrict() {
        return district;
    }

    public String getType() {
        return type;
    }

    public String getBlock_name() {
        return block_name;
    }

    public String getAddress() {
        return address;
    }

    public String getUnit_no() {
        return unit_no;
    }

    public String getPostal_code() {
        return postal_code;
    }

    public double getLat() {
        return lat;
    }

    public double getLng() {
        return lng;
    }
}
