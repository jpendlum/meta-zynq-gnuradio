DESCRIPTION = "Kernel module to allow userland applications access to the FPGA on a Zynq EPP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=ea8831610e926e2e469075b52bf08848"



USER_PERIPHERAL_VERSION ?= "0.1"
PV = "${USER_PERIPHERAL_VERSION}+git${SRCPV}"

SRC_URI = "git://bitbucket.org/mfischer/user-peripheral-kmod-public.git;protocol=https;branch=master"

SRCREV = "a5bd5859c691c80e9122d373980c8d15707f876b"

inherit module

S = "${WORKDIR}/git"
