DESCRIPTION = "A console-only image for Xilinx Zynq boards including Moritz Fischer's user-peripheral kernel driver"

IMAGE_FEATURES += "splash ssh-server-openssh tools-sdk tools-testapps \
                   tools-debug debug-tweaks dev-pkgs package-management"

CORE_IMAGE_EXTRA_INSTALL = "\
    libudev \
    boost \
    user-peripheral \
    git \
    gnuradio \
    emacs \
    kernel-dev \
    u-boot-xlnx \	
    "

inherit core-image
