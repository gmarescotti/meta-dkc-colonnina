
SUMMARY = "cstruct"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit setuptools3

SRC_URI = "http://intranet.rgm.it/pip/cstruct/cstruct-1.10.tar.gz"
SRC_URI[md5sum] = "45ba56179f953961db44976fdd76a4e3"
SRC_URI[sha256sum] = "830ad3816f3a43abfea90a22f9ea503c93113f9ac95a63e39da2aea40f4dfb67"

S = "${WORKDIR}/cstruct-1.10"

DEPENDS += " "

