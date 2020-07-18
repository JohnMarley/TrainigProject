package classes.Serializable_Training.savedGame;

import classes.Serializable_Training.diplomacyInfo.DiplomacyInfo;
import classes.Serializable_Training.resourcesInfo.ResourcesInfo;
import classes.Serializable_Training.territoriesInfo.TerritoriesInfo;

import java.io.Serializable;

/** Created by Kudlai 04/29/2019
 *
 */

public class SavedGame implements Serializable {

//    private static final long serialVersionUID = 1L;

    private transient TerritoriesInfo territoriesInfo;
    private ResourcesInfo resourcesInfo;
    private transient DiplomacyInfo diplomacyInfo;

    public SavedGame(TerritoriesInfo territoriesInfo, ResourcesInfo resourcesInfo, DiplomacyInfo diplomacyInfo){
        this.territoriesInfo = territoriesInfo;
        this.resourcesInfo = resourcesInfo;
        this.diplomacyInfo = diplomacyInfo;
    }

    public TerritoriesInfo getTerritoriesInfo() {
        return territoriesInfo;
    }

    public void setTerritoriesInfo(TerritoriesInfo territoriesInfo) {
        this.territoriesInfo = territoriesInfo;
    }

    public ResourcesInfo getResourcesInfo() {
        return resourcesInfo;
    }

    public void setResourcesInfo(ResourcesInfo resourcesInfo) {
        this.resourcesInfo = resourcesInfo;
    }

    public DiplomacyInfo getDiplomacyInfo() {
        return diplomacyInfo;
    }

    public void setDiplomacyInfo(DiplomacyInfo diplomacyInfo) {
        this.diplomacyInfo = diplomacyInfo;
    }
}
