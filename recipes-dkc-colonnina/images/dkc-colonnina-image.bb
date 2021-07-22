SUMMARY = "bitbake-layers recipe"
DESCRIPTION = "DKC colonnina project"
LICENSE = "MIT"

python do_display_banner() {
    bb.plain("***********************************************");
    bb.plain("*                                             *");
    bb.plain("*  Example recipe created by bitbake-layers   *");
    bb.plain("*                                             *");
    bb.plain("***********************************************");
}

addtask display_banner before do_build

# python3 addon packages versions
IMAGE_INSTALL_append += " git-dev" # per aiohttp
IMAGE_INSTALL_append = " python3-versions.inc"
IMAGE_INSTALL_append += " python3-*.bb"
IMAGE_INSTALL_append += " python3-djangorestframework"

## DEPENDS = "microchip-headless-image"

IMAGE_INSTALL_remove = " nodejs nodejs-npm greengrass"

IMAGE_INSTALL_append += " qtbase qtbase-tools qtbase-plugins"
IMAGE_INSTALL_append += " libavahi-gobject avahi-daemon libavahi-common libavahi-core libavahi-client avahi-dnsconfd libavahi-glib avahi-autoipd avahi-utils"
IMAGE_INSTALL_append += " qtscxml"

# SRC_URO = "file://helloworld.c"
# S = "${WORKDIR}
# do_compile() {
# ${CC} ${CFLAGS} ${LDFLAGS} helloworld.c -o helloworld
# }
# do_install() {
# install -d ${D}${bindir}
# install -m 0755 helloworld ${D}${bindir}
# }

