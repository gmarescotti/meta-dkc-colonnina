
SUMMARY = "CCS Build Configurator"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/ccsbuilderconfigurator/ccsbuilderconfigurator-0.0.16.tar.gz"
SRC_URI[sha256sum] = "b5412a1786836186d36c0905c6b4908c47772a442b3b0d05df3ddf3047562645"

S = "${WORKDIR}/ccsbuilderconfigurator-0.0.16"

DEPENDS += " "

