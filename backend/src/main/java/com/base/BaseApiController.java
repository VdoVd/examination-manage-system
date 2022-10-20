package com.base;

import com.utility.ModelMapperSingle;
import org.modelmapper.ModelMapper;

public class BaseApiController {
    protected final static String DEFAULT_PAGE_SIZE="10";

    protected final static ModelMapper modelMapper= ModelMapperSingle.Instance();
}
