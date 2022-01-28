package services;


import jdk.javadoc.internal.doclets.toolkit.util.ResourceIOException;
import models.AppModel;

import java.util.List;

public interface DataServices {

    /*
    Sometimes your actual goal at some point in your application
    will be to perform something as basic as just a CRUD operations.
    However, what we want to avoid is entangling the various layers of our application.
    And we want to maintain order in the control flow of execution.
    Thereby, if we need to perform a simple CRUD operation we shouldn't
    skip layers, such as the Service Layer, but instead, trivially, pass through it.
     */

    public AppModel addMovie(AppModel m);
    public AppModel getMovie(int id);
    public List<AppModel> getAllData();
    public AppModel updateData(AppModel change);
    public AppModel deleteData(int id) throws ResourceIOException;

}