package com.test.Module;

import java.util.List;

public class SearchResultBean {
  private int total;
  private RegionBean region;
  private List<BusinessesBean> businesses;
  public int getTotal() {
    return total;
  }
  public void setTotal(int total) {
    this.total = total;
  }
  public RegionBean getRegion() {
    return region;
  }
  public void setRegion(RegionBean region) {
    this.region = region;
  }
  public List<BusinessesBean> getBusinesses() {
    return businesses;
  }
  public void setBusinesses(List<BusinessesBean> businesses) {
    this.businesses = businesses;
  }
  public static class RegionBean {
    private CenterBean center;
    public CenterBean getCenter() {
      return center;
    }
    public void setCenter(CenterBean center) {
      this.center = center;
    }
    public static class CenterBean {
      private double longitude;
      private double latitude;
      public double getLongitude() {
        return longitude;
      }
      public void setLongitude(double longitude) {
        this.longitude = longitude;
      }
      public double getLatitude() {
        return latitude;
      }
      public void setLatitude(double latitude) {
        this.latitude = latitude;
      }
    }
  }

  public static class BusinessesBean {
    private String id;
    private String alias;
    private String name;
    private String image_url;
    private boolean is_closed;
    private String url;
    private int review_count;
    private double rating;
    private CoordinatesBean coordinates;
    private String price;
    private LocationBean location;
    private String phone;
    private String display_phone;
    private double distance;
    private List<CategoriesBean> categories;
    private List<?> transactions;
    public String getId() {
      return id;
    }
    public void setId(String id) {
      this.id = id;
    }
    public String getAlias() {
      return alias;
    }
    public void setAlias(String alias) {
      this.alias = alias;
    }
    public String getName() {
      return name;
    }
    public void setName(String name) {
      this.name = name;
    }
    public String getImage_url() {
      return image_url;
    }
    public void setImage_url(String image_url) {
      this.image_url = image_url;
    }
    public boolean isIs_closed() {
      return is_closed;
    }
    public void setIs_closed(boolean is_closed) {
      this.is_closed = is_closed;
    }
    public String getUrl() {
      return url;
    }
    public void setUrl(String url) {
      this.url = url;
    }
    public int getReview_count() {
      return review_count;
    }
    public void setReview_count(int review_count) {
      this.review_count = review_count;
    }
    public double getRating() {
      return rating;
    }
    public void setRating(double rating) {
      this.rating = rating;
    }
    public CoordinatesBean getCoordinates() {
      return coordinates;
    }
    public void setCoordinates(CoordinatesBean coordinates) {
      this.coordinates = coordinates;
    }
    public String getPrice() {
      return price;
    }
    public void setPrice(String price) {
      this.price = price;
    }
    public LocationBean getLocation() {
      return location;
    }
    public void setLocation(LocationBean location) {
      this.location = location;
    }
    public String getPhone() {
      return phone;
    }
    public void setPhone(String phone) {
      this.phone = phone;
    }
    public String getDisplay_phone() {
      return display_phone;
    }
    public void setDisplay_phone(String display_phone) {
      this.display_phone = display_phone;
    }
    public double getDistance() {
      return distance;
    }
    public void setDistance(double distance) {
      this.distance = distance;
    }
    public List<CategoriesBean> getCategories() {
      return categories;
    }
    public void setCategories(List<CategoriesBean> categories) {
      this.categories = categories;
    }
    public List<?> getTransactions() {
      return transactions;
    }
    public void setTransactions(List<?> transactions) {
      this.transactions = transactions;
    }
    public static class CoordinatesBean {
      private double latitude;
      private double longitude;
      public double getLatitude() {
        return latitude;
      }
      public void setLatitude(double latitude) {
        this.latitude = latitude;
      }
      public double getLongitude() {
        return longitude;
      }
      public void setLongitude(double longitude) {
        this.longitude = longitude;
      }
    }

    public static class LocationBean {
      private String address1;
      private String address2;
      private String address3;
      private String city;
      private String zip_code;
      private String country;
      private String state;
      private List<String> display_address;
      public String getAddress1() {
        return address1;
      }
      public void setAddress1(String address1) {
        this.address1 = address1;
      }
      public String getAddress2() {
        return address2;
      }
      public void setAddress2(String address2) {
        this.address2 = address2;
      }
      public String getAddress3() {
        return address3;
      }
      public void setAddress3(String address3) {
        this.address3 = address3;
      }
      public String getCity() {
        return city;
      }
      public void setCity(String city) {
        this.city = city;
      }
      public String getZip_code() {
        return zip_code;
      }
      public void setZip_code(String zip_code) {
        this.zip_code = zip_code;
      }
      public String getCountry() {
        return country;
      }
      public void setCountry(String country) {
        this.country = country;
      }
      public String getState() {
        return state;
      }
      public void setState(String state) {
        this.state = state;
      }
      public List<String> getDisplay_address() {
        return display_address;
      }
      public void setDisplay_address(List<String> display_address) {
        this.display_address = display_address;
      }
    }

    public static class CategoriesBean {
      private String alias;
      private String title;
      public String getAlias() {
        return alias;
      }
      public void setAlias(String alias) {
        this.alias = alias;
      }
      public String getTitle() {
        return title;
      }
      public void setTitle(String title) {
        this.title = title;
      }
    }
  }
}