
SUMMARY = "CCS Build Configurator"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ccsbuilderconfigurator/ccsbuilderconfigurator-0.0.15.tar.gz"
SRC_URI[md5sum] = "d7d018afc60f78426efdd07c424db7ed"
SRC_URI[sha256sum] = "75c9bd9c8c74420f43bea6243888a85b27e4fcf5806735acd09d4ef8c6a2ee25"

S = "${WORKDIR}/ccsbuilderconfigurator-0.0.15"

DEPENDS += " "

