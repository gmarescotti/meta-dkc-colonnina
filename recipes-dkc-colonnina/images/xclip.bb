# NOTE: not working.. TODO:

require recipes-graphics/xorg-app/xorg-app-common.inc

SUMMARY = "XCLIP clipboard utilities"
DESCRIPTION = "xclip is a command line utility that is designed to run on any system with an X11 implementation. It provides an interface to X selections ("the clipboard") from the command line. It can read data from standard in or a file and place it in an X selection for pasting into other X applications. xclip can also print an X selection to standard out, which can then be redirected to a file or another program."
HOMEPAGE = "https://github.com/astrand/xclip"

LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=393a5ca445f6965873eca0259a17f833"

DEPENDS += "libxmu"

SRC_URI = "git://github.com/astrand/xclip.git;protocol=https;branch=${BRANCH}"

BRANCH = "master"
# SRCREV = "99c942c90063c73734e56bacaa65f947772d9186"
SRCREV = "${AUTOREV}"

S = "${WORKDIR}/git"
# CFLAGS =+ "-I${B}"
# EXTRA_OEMAKE = "VPATH=${S}"

inherit autotools pkgconfig

do_install() {
    # install -Dm 755 ${B}/fcgiwrap ${D}${sbindir}/fcgiwrap
}
