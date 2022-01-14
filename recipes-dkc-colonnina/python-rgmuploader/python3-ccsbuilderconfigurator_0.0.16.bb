
SUMMARY = "CCS Build Configurator"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ccsbuilderconfigurator/ccsbuilderconfigurator-0.0.16.tar.gz"
SRC_URI[md5sum] = "13420a5f034662f4c5e8a687e3e168bd"
SRC_URI[sha256sum] = "898fff038e744d069238c2f6e9106655ed6d2567ae496c8886c1b54be48f5db2"

S = "${WORKDIR}/ccsbuilderconfigurator-0.0.16"

DEPENDS += " "

