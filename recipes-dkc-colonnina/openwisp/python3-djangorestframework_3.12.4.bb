
SUMMARY = "Web APIs for Django, made easy."
HOMEPAGE = "https://www.django-rest-framework.org/"
AUTHOR = "Tom Christie <tom@tomchristie.com>"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE.md;md5=7879a5a716147a784f7e524c9cf103c1"

inherit setuptools3

SRC_URI = "https://files.pythonhosted.org/packages/cb/2e/86d38af19dcacccb53feda081cb5f4d6954480bfca961bc4dee31501bc99/djangorestframework-3.12.4.tar.gz"
SRC_URI[md5sum] = "3977767dea0425d8101a6ea97dc7fd3c"
SRC_URI[sha256sum] = "f747949a8ddac876e879190df194b925c177cdeb725a099db1460872f7c0a7f2"

S = "${WORKDIR}/djangorestframework-3.12.4"

DEPENDS += " "
RDEPENDS_${PN} = "python3-django"

BBCLASSEXTEND = "native nativesdk"
