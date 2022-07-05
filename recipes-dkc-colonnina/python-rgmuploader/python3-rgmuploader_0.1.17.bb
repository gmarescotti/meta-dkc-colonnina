
SUMMARY = "Uploader for PRCK files"
HOMEPAGE = "http://gitlab.rgm5.it/generic/pyutilities.git"
AUTHOR = "Giulio Marescotti <giulio.marescotti@rgm.it>"
LICENSE = "CLOSED"

inherit pypi setuptools3

SRC_URI = "http://intranet.rgm.it/pip/rgmuploader/rgmuploader-0.1.17.tar.gz"
SRC_URI[sha256sum] = "ebc17b3681e0b9f8e72112a98c2120a96e5dbd4f8de3b49f0f46ec69fbbcec4e"

S = "${WORKDIR}/rgmuploader-0.1.17"

RDEPENDS_${PN} += " python3-singleton-decorator"

