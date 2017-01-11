package SoftwareRSS;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.io.IOException;

/**
 * Created by Aurélien on 10/01/2017.
 */
public class CustomRssStreamListCell extends ListCell<RssStream> {
    @FXML
    private Label titleLabel;

    @FXML
    private ImageView iconView;

    public CustomRssStreamListCell()
    {
        super();
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("customRssStreamCell.fxml"));
        loader.setController(this);
        try
        {
            setGraphic(loader.load());
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    @Override
    public void updateItem(RssStream item, boolean empty)
    {
        super.updateItem(item, empty);
        if (!empty && item != null)
        {
            iconView.setImage(new Image(item.getImageUrl()));
            titleLabel.setText(item.getTitle());
        }
    }
}