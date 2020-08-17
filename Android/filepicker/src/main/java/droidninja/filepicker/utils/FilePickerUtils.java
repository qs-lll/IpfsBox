package droidninja.filepicker.utils;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.ColorRes;
import androidx.annotation.IdRes;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import android.text.TextUtils;

import com.android.internal.util.Predicate;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;

/**
 * Created by droidNinja on 29/07/16.
 */
public class FilePickerUtils {

  public static <T> Collection<T> filter(Collection<T> target, Predicate<T> predicate) {
    Collection<T> result = new ArrayList<T>();
    for (T element : target) {
      if (predicate.apply(element)) {
        result.add(element);
      }
    }
    return result;
  }

  public static String getFileExtension(File file) {
    String name = file.getName();
    try {
      return name.substring(name.lastIndexOf(".") + 1);
    } catch (Exception e) {
      return "";
    }
  }

  public static boolean contains(String[] types, String path) {
    for (String string : types) {
      if (path.toLowerCase().endsWith(string)) return true;
    }
    return false;
  }

  public static <T> boolean contains2(final T[] array, final T v) {
    if (v == null) {
      for (final T e : array)
        if (e == null)
          return true;
    } else {
      for (final T e : array)
        if (e == v || v.equals(e))
          return true;
    }

    return false;
  }

  public static void notifyMediaStore(Context context, String path) {
    if (path != null && !TextUtils.isEmpty(path)) {
      Intent mediaScanIntent = new Intent(Intent.ACTION_MEDIA_SCANNER_SCAN_FILE);
      File f = new File(path);
      Uri contentUri = Uri.fromFile(f);
      mediaScanIntent.setData(contentUri);
      context.sendBroadcast(mediaScanIntent);
    }
  }
}
