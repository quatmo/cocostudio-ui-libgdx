package org.freyja.libgdx.cocostudio.ui.parser.group;

import org.freyja.libgdx.cocos.creator.ui.CocoCreatorUIEditor;
import org.freyja.libgdx.cocostudio.ui.model.ObjectData;
import org.freyja.libgdx.cocostudio.ui.parser.GroupParser;

import com.badlogic.gdx.scenes.scene2d.Actor;
import com.badlogic.gdx.scenes.scene2d.ui.Table;

/**
 * 
 * 数字标签,暂时不支持.首字符设置.也就是说数字图片必须是0-9
 * 
 * @author i see
 * 
 */
public class CCLabelAtlas extends GroupParser {

	@Override
	public String getClassName() {
		return "LabelAtlas";
	}

	@Override
	public Actor parse(CocoCreatorUIEditor editor, ObjectData widget) {

//		if (option.getCharMapFileData() != null) {
//			TextureRegion tr = editor.findTextureRegion(option, option
//					.getCharMapFileData().getPath());
//			if (tr != null) {
//				LabelAtlas label = new LabelAtlas(tr, option.getItemWidth(),
//						option.getItemHeight(), option.getStartCharMap(),
//						option.getStringValue());
//				return label;
//
//			}
//		}

		return new Table();
	}
}
