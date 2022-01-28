package repositories;

import jdk.javadoc.internal.doclets.toolkit.util.ResourceIOException;
import models.AppModel;

import java.util.List;

public interface DataRepo {
    public AppModel addData(AppModel m);
    public AppModel getData(int id);
    public List<AppModel> getAllData();
    public AppModel updateData(AppModel change);
    public AppModel deleteData(int id) throws ResourceIOException;
}
