package com.bumptech.glide.load.resource.file;

import com.bumptech.glide.load.Options;
import com.bumptech.glide.load.ResourceDecoder;
import com.bumptech.glide.load.engine.Resource;
import java.io.File;

/**
 * A simple {@link ResourceDecoder} that creates resource for a given {@link
 * File}.
 */
public class FileDecoder implements ResourceDecoder<File, File> {

  @Override
  public boolean handles(File source, Options options) {
    return true;
  }

  @Override
  public Resource<File> decode(File source, int width, int height, Options options) {
    return new FileResource(source);
  }
}
